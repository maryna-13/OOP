package com.gildedrose;

class GildedRose {
    Item[] items;
    // перевірка чи товар є Aged Brie
    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    // перевірка чи товар є Backstage Pass
    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    // перевірка чи товар є Sulfuras
    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }


    public GildedRose(Item[] items) {
        this.items = items;
    }

    // оновлення всіх товарів
    public void updateQuality() {
        for (Item item : items) {

            if (isAgedBrie(item)) {
                updateAgedBrie(item);
            }

            if (isBackstagePass(item)) {
                updateBackstagePass(item);
            }

            if (isRegularItem(item)) {
                updateRegularItem(item);
            }

            if (!isSulfuras(item)) {
                decreaseSellIn(item);
            }

            updateExpiredItem(item);
        }
    }

    // оновлення звичайного товару
    private void updateRegularItem(Item item) {
        // якщо quality вже 0 — нічого не робимо
        if (!qualityCanDecrease(item)) {
            return;
        }
        // зменшуємо quality
        decreaseQuality(item);
    }

    // оновлення Aged Brie
    private void updateAgedBrie(Item item) {
        // quality збільшується з часом
        increaseQualityIfPossible(item);
    }

    // оновлення Backstage Pass
    private void updateBackstagePass(Item item) {
        // стандартне збільшення quality
        increaseQualityIfPossible(item);
        // якщо до концерту менше 11 днів
        if (item.sellIn < 11) {
            increaseQualityIfPossible(item);
        }
        // якщо до концерту менше 6 днів
        if (item.sellIn < 6) {
            increaseQualityIfPossible(item);
        }
    }

    // для прострочених товарів
    private void updateExpiredItem(Item item) {
        // якщо товар ще не прострочений
        if (item.sellIn >= 0) {
            return;
        }
        // після концерту quality стає 0
        if (isBackstagePass(item)) {
            zeroQuality(item);
            return;
        }
        // Aged Brie після прострочення збільшує quality ще швидше
        if (isAgedBrie(item)) {
            increaseQualityIfPossible(item);
            return;
        }
        // звичайний товар після прострочення псується швидше
        if (qualityCanDecrease(item) && !isSulfuras(item)) {
            decreaseQuality(item);
        }
    }

    // перевірка чи товар є звичайним
    private boolean isRegularItem(Item item) {
        return !isAgedBrie(item)
            && !isBackstagePass(item)
            && !isSulfuras(item);
    }

    // перевірка максимальної якості
    // перевірка чи quality може збільшуватись
    private boolean qualityCanIncrease(Item item) {
        return item.quality < 50;
    }
    // перевірка чи quality може зменшуватись
    private boolean qualityCanDecrease(Item item) {
        return item.quality > 0;
    }
    // збільшення quality якщо це дозволено
    private void increaseQualityIfPossible(Item item) {
        if (qualityCanIncrease(item)) {
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

    // зменшення sellIn
    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }


}
