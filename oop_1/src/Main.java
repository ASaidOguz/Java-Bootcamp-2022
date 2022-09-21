public class Main {
    public static void main(String[] args) {

        String mesaj = "Wassup!";

        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinasi");
        product1.setUnitPrice(6.600);
        product1.setDisCount(0.07);
        product1.setUnitsInStock(200);
        product1.setImageUrl("www.unkwon.png");

        Product product2 = new Product();
        //set value
        product2.setName("Sneg Kahve Makinasi");
        product2.setUnitPrice(4.600);
        product2.setDisCount(0.07);
        product2.setUnitsInStock(100);
        product2.setImageUrl("www.unkwon1.png");

        Product product3=new Product();
        //set value
        product3.setName("Sinbo Kahve Makinasi");
        product3.setUnitPrice(3.600);
        product3.setDisCount(0.07);
        product3.setUnitsInStock(400);
        product3.setImageUrl("www.unkwon3.png");

        Product[] products={product1,product2,product3};

        for(Product product:products){
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
        }
        individualCustomer individualCustomer1=new individualCustomer();
        individualCustomer1.setCustomerNumber("2350");
        System.out.println(individualCustomer1.getCustomerNumber());

        individualCustomer1.setName("Ahmet");
        individualCustomer1.setLastName("Oğuz");
        System.out.println(individualCustomer1.getName()+" "+individualCustomer1.getLastName());

        CorporateCustomer corporateCustomer1=new CorporateCustomer();
        corporateCustomer1.setCompanyName("Mozilla");
        corporateCustomer1.setTaxNumber("12222");
        //INHERİTANCE
        //U can put all the children in array !!
        Customer[]customers={individualCustomer1,corporateCustomer1};
    }
}