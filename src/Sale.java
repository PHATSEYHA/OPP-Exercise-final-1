class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double totalExpense = getServiceExpense() + getProductExpense();
        double serviceDiscount = getServiceExpense() * customer.getServiceDiscountRate(customer.getCustomerType());
        double productDiscount = getProductExpense() * customer.getProductDiscountRate(customer.getCustomerType());
        return totalExpense - serviceDiscount - productDiscount;
    }

    public double getServiceDiscount() {
        return getServiceExpense() * customer.getServiceDiscountRate(customer.getCustomerType());
    }

    public double getProductDiscount() {
        return getProductExpense() * customer.getProductDiscountRate(customer.getCustomerType());
    }

    public void displayInfo() {
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + getDate());
        System.out.println("Service Expense: $" + getServiceExpense());
        System.out.println("Service Discount: $" + getServiceDiscount());
        System.out.println("Product Expense: $" + getProductExpense());
        System.out.println("Product Discount: $" + getProductDiscount());
        System.out.println("Total Expense: $" + getTotalExpense());
    }
}
