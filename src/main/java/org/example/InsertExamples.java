package org.example;

public class InsertExamples {
    public static void addExampleWarehouses(WarehouseManager manager){
        Warehouse warehouse1 = new Warehouse(1, "Stockholm");
        Warehouse warehouse2 = new Warehouse(2, "Falun");
        Warehouse warehouse3 = new Warehouse(3, "Sundsvall");

        manager.addWarehouseToList(warehouse1);
        manager.addWarehouseToList(warehouse2);
        manager.addWarehouseToList(warehouse3);
    }

    public static void addExampleProducts(WarehouseManager manager) {

        Product product1 = new Product("iPhone 15", 1, 12000.00, "Apple iPhone 15");
        Product product2 = new Product("Galaxy S23", 2, 10000, "Samsung Galaxy S23");
        Product product3 = new Product("iPad Air", 3, 8000, "Apple iPad Air 2022");



        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("1"), product1);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("1"), product2);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("1"), product3);

        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("2"), product1);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("2"), product2);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("2"), product3);

        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("3"), product1);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("3"), product2);
        manager.addProductToWarehouse(manager.getWarehouseFromIdOrName("3"), product3);
    }


}
