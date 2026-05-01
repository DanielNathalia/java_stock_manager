package strategy;

import model.Product;

import java.time.LocalDate;

public interface DiscountStrategy {
    Product applyDiscount(Product p);

    //Desconto por Expiração
    public class ExpirationDiscount implements DiscountStrategy {
        private double percentage;

        public ExpirationDiscount(double percentage){
            this.percentage = percentage;
        }
        @Override
        public Product applyDiscount(Product p){
            double newPrice = p.getPrice() * (1 - percentage / 100);
            p.setPrice(newPrice);
            return p;
        }
    }
}



