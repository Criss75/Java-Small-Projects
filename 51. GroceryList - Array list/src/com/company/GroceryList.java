package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        if (findItem(currentItem) >= 0) {
            modifyGroceryItem(findItem(currentItem), newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        if (findItem(item) >= 0) {
            removeGroceryItem(findItem(item));
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        if (findItem(searchItem) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

}
