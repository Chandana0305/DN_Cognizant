import java.util.*;

class searchDemo{
    static Product linearSearch(Product[] p, int id) {
        for (Product x : p)
            if (x.productId == id)
                return x;
        return null;
    }

    static Product binarySearch(Product[] p, int id) {
        int l = 0, h = p.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (p[m].productId == id) return p[m];
            if (p[m].productId < id) l = m + 1;
            else h = m - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] p = {
            new Product(104,"Laptop","Electronics"),
            new Product(101,"Mobile","Electronics"),
            new Product(103,"Shoes","Fashion"),
            new Product(105,"Bag","Travel"),
            new Product(102,"Watch","Accessories")
        };

        Product r = linearSearch(p, 103);
        System.out.println("Linear Search: " + (r != null ? r.productName : "Not Found"));

        Arrays.sort(p, Comparator.comparingInt(x -> x.productId));

        r = binarySearch(p, 103);
        System.out.println("Binary Search: " + (r != null ? r.productName : "Not Found"));
    }
}
