public class Activity1 extends IntegerManager implements PrintPretty {
    public static void main(String[] args) throws Exception {
        Activity1 thingy = new Activity1();
        thingy.buildList();
        thingy.printPretty();
        thingy.shuffle();
        thingy.printPretty();
    }

    @Override
    void buildList(){
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            int rand = (int)(Math.random() * 100);
            nums[i] = rand;
            System.out.println(nums[i]);
        }
        
    }

    public void printPretty(){
        System.out.print("[ ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
    
    @Override
    void shuffle(){
        //loop thru all nums, index i
        //pick random spot, r
        //3 part swap, r-> temp -> i
        for(int i = 0; i < nums.length; i++){
            int r = (int)(Math.random() * (20));
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }
    }
    
    @Override
    void insertionSort(){
    }

    @Override
    void selectionSort(){
    }

    @Override
    void mergeSort(){
    }

    @Override
    int pickRandom(){
        return 0;
    }
}
