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
            if (!isAgedBrie(items[i]) && !isBackstagePass(items[i])) {
                updateRegularItem(items[i]);
            }
            else if (isAgedBrie(items[i])) {
                updateAgedBrie(items[i]);
            } else {
                if (isBackstagePass(items[i])) {

                    if (items[i].quality < 50) {
                        increaseQuality(items[i]);
                    }

                    if (items[i].sellIn < 11) {
                        if (items[i].quality < 50) {
                            increaseQuality(items[i]);
                        }
                    }

                    if (items[i].sellIn < 6) {
                        if (items[i].quality < 50) {
                            increaseQuality(items[i]);
                        }
                    }
                }
            }

            if (!isSulfuras(items[i])) {
                decreaseSellIn(items[i]);
            }

            if (items[i].sellIn < 0) {
                if (!isAgedBrie(items[i])) {
                    if (!isBackstagePass(items[i])) {
                        if (items[i].quality > 0) {
                            if (!isSulfuras(items[i])){
                                decreaseQuality(items[i]);
                            }
                        }
                    } else {
                        zeroQuality(items[i]);
                    }
                } else {
                    if (items[i].quality < 50) {
                        increaseQuality(items[i]);
                    }
                }
            }
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
