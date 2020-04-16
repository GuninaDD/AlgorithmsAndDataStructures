package com.geekbrains.lesson5.sample.bagpack;

public class Packager {
    private Item[] items;
    private final int maxWeight;
    private Bagpack bestPack;

    public Packager(Item[] items, int maxWeight) {
        this.items = items;
        this.maxWeight = maxWeight;
        this.bestPack = new Bagpack(maxWeight);
    }

    public Bagpack pack() {

        if (allFit()) return bestPack;

        pack(items.length);

        return bestPack;
    }

    private boolean allFit() {
        boolean allFit = true;
        Bagpack bagpack = new Bagpack(maxWeight);

        for (Item item : items) {
            if (!bagpack.add(item)) {
                allFit = false;
                break;
            }
        }
        if (allFit) {
            bestPack = bagpack;
        }
        return allFit;
    }

    private void pack(int count) {

        if (count == 1) {
            return;
        }
        for (int i = 0; i < count; i++) {
            pack(count - 1);
            checkBestPack();
            rotate(count);
        }
    }

    private void checkBestPack() {

        Bagpack bagpack = new Bagpack(maxWeight);

        for (Item item : items) {
            if (!bagpack.add(item)) {
                break;
            }
        }
        if (bagpack.compareTo(bestPack) > 0) {
            bestPack = bagpack;
        }
    }

    private void rotate(int length) {
        int pos = items.length - length;
        Item temp = items[pos];
        for (int i = pos + 1; i < items.length; i++) {
            items[i - 1] = items[i];
        }

        items[items.length - 1] = temp;
    }
}
