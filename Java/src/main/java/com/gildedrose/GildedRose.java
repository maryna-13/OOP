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
                if (items[i].quality > 0) {
                    if (!isSulfuras(items[i])) {
                        decreaseQuality(items[i]);;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    increaseQuality(items[i]);

                    if (isBackstagePass(items[i])) {
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
            }

            if (!isSulfuras(items[i])) {
                items[i].sellIn = items[i].sellIn - 1;
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
                        items[i].quality = items[i].quality + 1;
                    }
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


}
