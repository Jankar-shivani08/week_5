class fact {
    public static long calculate(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        int n = 5;
        calculate(5);
    }
}
