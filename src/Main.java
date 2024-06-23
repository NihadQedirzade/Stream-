import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(862L, "bassiz atli", "Book", 1020D));
        products.add(new Product(862L, "bassifaz atli", "Book", 1420D));
        products.add(new Product(862L, "bassifaz atli", "Book", 14D));
        products.add(new Product(863L, "mavi qatar", "Toys", 108.23D));
        products.add(new Product(864L, "mavi qaw tar", "Toys", 15.23D));
        products.add(new Product(873L, "mavi qatar", "Toys", 1052.23D));
        products.add(new Product(864L, "Duman", "komedidiya", 22.4D));


        //sual 1
//        List<Product> cavab = products.stream()
//                                      .filter(product -> product.getPrice()>100 && product.getCategory().equals("Book"))
//                                      .toList();
//        for(Product pro : cavab){
//            System.out.println(pro);
//        }

        //sual 2
//          List<Double> toys = products.stream()
//                  .filter(p->p.getCategory().equals("Toys"))
//                  .map(p->p.getPrice()*0.9).toList();
//          for (Double pro : toys){
//              System.out.println(pro);
//          }

        //sual 3
//List<Product> enucuz = products.stream().
//        filter(product -> product.getCategory().equals("Book")).
//       min((s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice()))
//        .stream().toList();
//
//        for (Product pro : enucuz){
//              System.out.println(pro);
//
//          }


        //Sual4: Order-lerin tarixlerine gore artan sira ile siralayin

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(17L, "completed", LocalDate.of(2023, 6, 10)));
        orders.add(new Order(145L, "process deleted", LocalDate.of(2024, 6, 10)));
        orders.add(new Order(17L, "process deleted", LocalDate.of(2025, 6, 10)));
        orders.add(new Order(87L, "completed", LocalDate.of(2022, 6, 10)));
//
//        List<Order> sortedOrders = orders.stream()
//                .sorted(Comparator.comparing(Order::getOrderDate))
//                .toList();
//
//        sortedOrders.forEach(order -> System.out.println("Order ID: " + order.getId() + ", Status: " + order.getStatus() + ", Date: " + order.getOrderDate()));
        //sual5
        //Butun musterilerin(Customer) adini boyuk heriflere cevirin
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(14L, "Nihat", 100));
        customers.add(new Customer(27L, "sahib", 45));
        customers.add(new Customer(37L, "eli", 97));
//
//
//        List<String> boyukad = customers.stream().map(m->m.getName().toUpperCase()).toList();
//
//        System.out.println(boyukad);


        //Sual6:Butun mehsullarin(Product) orta qiymetini tapin(avarage)




        //Sual7:"Complated" statuslu sifarislerin sayini tapin

//        List<Order> completedsayi = orders.stream().filter(p->p.getStatus().equals("completed")).toList();
//        for (Order or : completedsayi){
//            System.out.println(or);
//        }


        //sual7 max price-li productu tapin


//        List<Product> maxprice = products.stream().max((s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice())).stream().toList();
//        System.out.println(maxprice);


    }}
