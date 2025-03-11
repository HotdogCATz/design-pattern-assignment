package q2;

class Live implements Subscriber {
    private String name;

    public Live(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println(name + " live result: " + score);
    }
}
