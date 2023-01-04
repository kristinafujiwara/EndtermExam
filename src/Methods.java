class Methods extends Result {
    public static int computeRetail(String value1) {
        int num1 = Integer.parseInt(value1);
        int retail = (num1 / (100 - 45)) * 100;
        return retail;
    }
    public static int computeWholesale(String retailprice) {
        int retail = Integer.parseInt(retailprice);
        int wholesale = (int) (retail * (60.0f/100.0f));
        return wholesale;
    }
}
