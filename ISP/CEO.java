class CEO implements ICEO {
    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void makeDecision() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStock() {
        System.out.println("Gettings shares of the company as bonus...");
    }
}