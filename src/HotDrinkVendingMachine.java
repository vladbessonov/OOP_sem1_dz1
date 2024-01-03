import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotDrinkVendingMachine {
    private List<Product> productList = new ArrayList();

    public HotDrinkVendingMachine() {
    }

    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct(String name) {
        Iterator var2 = this.productList.iterator();

        Product item;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            item = (Product)var2.next();
        } while(!item.getName().equals(name));

        return item;
    }

    public Product getProduct(String name, int volume) {
        Iterator var3 = this.productList.iterator();

        Product item;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            item = (Product)var3.next();
        } while(!item.getName().equals(name) || ((HotDrink)item).getVolume() != volume);

        return item;
    }

    public Product getProduct(int volume) {
        Iterator var2 = this.productList.iterator();

        Product item;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            item = (Product)var2.next();
        } while(((HotDrink)item).getVolume() != volume);

        return item;
    }
}
