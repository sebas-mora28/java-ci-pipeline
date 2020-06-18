public class main {


    public static void main(String[] args) {

        //int nums[] = {0,0,1,1,1,2,2,3,3,4};


        int nums[] = {1,1,2,2,3,4,4,5,5};
        int len = removeDuplicates(nums);


        System.out.println("********************************************");

        for(int i =0; i < len; i++ ){
            System.out.println(nums[i]);
        }



    }



    public static int removeDuplicates(int[] nums) {


        int len = 0;
        for(int i=0; i < nums.length; i++){

            int current = i+1;
            while(current < nums.length){
                System.out.println(current  + "  "+ nums[current]);

                if(nums[current] != nums[i]){
                    break;
                }
                current++;
            }
            i = current-1;
            System.out.println("NEW I " + i);
            nums[len] = nums[i];
            System.out.println(nums[len]);
            len++;
        }

        return len;

    }



}

