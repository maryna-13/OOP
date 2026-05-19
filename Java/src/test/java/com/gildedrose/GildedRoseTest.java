package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test  //звичайний товар: sellIn і quality зменшуються на 1 після одного дня
    void regularItemDecreasesSellInAndQuality() {

        Item[] items = new Item[] {
            new Item("foo", 10, 20)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
    }

    @Test // Aged Brie: з часом quality збільшується, а sellIn зменшується
    void agedBrieIncreasesQuality() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 0)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(1, items[0].quality);
        assertEquals(1, items[0].sellIn);
    }


    @Test // Sulfuras: легендарний товар, sellIn і quality не змінюються
    void sulfurasNeverChanges() {

        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }


    @Test // Пропуск з лаштунки: quality збільшується на 1, якщо sellIn > 10
    void backstagePassesIncreaseQualityByOne() {

        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(14, items[0].sellIn);
        assertEquals(21, items[0].quality);
    }


    @Test // Пропуск за лаштунки: якість збільшується на 2, якщо sellIn < 11
    void backstagePassesIncreaseQualityByTwo() {

        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(22, items[0].quality);
    }

    @Test // Пропуск за лаштунки: якість збільшується на 3, якщо sellIn < 6
    void backstagePassesIncreaseQualityByThree() {

        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20)
        };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(23, items[0].quality);
    }

}
