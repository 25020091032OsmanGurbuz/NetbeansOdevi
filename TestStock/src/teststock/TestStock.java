
package teststock;


public class TestStock {

    public static void main(String[] args) {

        Stock hisse = new Stock("ORCL", "Oracle Corporation");

        hisse.previousClosingPrice = 34.5;
        hisse.currentPrice = 34.35;

        System.out.println("Hisse Sembolu: " + hisse.symbol);
        System.out.println("Hisse Adi: " + hisse.name);
        System.out.println("Onceki Kapanis Fiyati: " + hisse.previousClosingPrice);
        System.out.println("Guncel Fiyat: " + hisse.currentPrice);
        System.out.println("Degisim Yuzdesi: %" + hisse.getChangePercent());
    }
}

class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice)
                / previousClosingPrice) * 100;
    }
}