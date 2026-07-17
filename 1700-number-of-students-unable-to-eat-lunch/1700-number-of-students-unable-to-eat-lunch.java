class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleSandwish = 0;
        int squareSandwish = 0;

        for(int choice : students){
            if(choice == 0){
                circleSandwish++;
            }else{
                squareSandwish++;
            }
        }
        for(int sandwish: sandwiches){
            if(sandwish==0 && circleSandwish==0){
                return squareSandwish;
            }
            if(sandwish == 1 && squareSandwish ==0){
                return circleSandwish;
            }
            if(sandwish==0){
                circleSandwish--;
            }else{
                squareSandwish--;
            }
        }
        return 0;
        
    }
}