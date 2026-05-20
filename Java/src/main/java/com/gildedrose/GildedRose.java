package com.gildedrose;

class GildedRose {
    Item[] items;
    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }


    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];

            if (isAgedBrie(item)) {
                updateAgedBrie(item);
            }

            if (isBackstagePass(item)) {
                updateBackstagePass(item);
            }

            if (!isAgedBrie(item) && !isBackstagePass(item)) {
                updateRegularItem(item);
            }

            if (!isSulfuras(item)) {
                decreaseSellIn(item);
            }

            updateExpiredItem(item);
        }
    }

    private void updateRegularItem(Item item) {
        if (item.quality > 0) {
            if (!isSulfuras(item)) {
                decreaseQuality(item);
            }
        }
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            increaseQuality(item);
        }
    }

    private void updateBackstagePass(Item item) {
        if (item.quality < 50) {
            increaseQuality(item);
        }

        if (item.sellIn < 11) {
            if (item.quality < 50) {
                increaseQuality(item);
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                increaseQuality(item);
            }
        }
    }

    private void updateExpiredItem(Item item) {
        if (item.sellIn < 0) {
            if (!isAgedBrie(item)) {
                if (!isBackstagePass(item)) {
                    if (item.quality > 0) {
                        if (!isSulfuras(item)) {
                            decreaseQuality(item);
                        }
                    }
                } else {
                    zeroQuality(item);
                }
            } else {
                if (item.quality < 50) {
                    increaseQuality(item);
                }
            }
        }
    }

    // зміни якості
    private void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void zeroQuality(Item item) {
        item.quality = 0;
    }


    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }


}
