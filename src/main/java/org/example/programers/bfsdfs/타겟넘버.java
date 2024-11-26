package org.example.programers.bfsdfs;

/**
 * packageName    : org.example.programers.bfsdfs
 * fileName       : 타겟넘버
 * author         : mac
 * date           : 10/24/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/24/24        mac       최초 생성
 */
public class 타겟넘버 {

    public static int answer = 0;
    public static int[] givenNumbers;

    public static void main(String[] args) {
        givenNumbers = new int[] {1,1,1,1,1};
        int target =3;
        dfs(0,0,target);

        System.out.println(answer);
    }


    public static void dfs(int depth, int sum, int target){
        System.out.println("depth = "+ depth);
        System.out.println("sum = "+sum);
        if(depth==givenNumbers.length){
            System.out.println(depth);
            if(sum==target){
                answer++;
            }

            return;
        }


        dfs(depth+1,sum-givenNumbers[depth],target);
        dfs(depth+1,sum+givenNumbers[depth],target);
    }
}
