
import java.util.Arrays;

/**
 *
 * 删除数组中的元素
 */
public class TestOpArray2 {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{9,8,7,6,5,4};

        //要删除数组的下标
        int dst = 5;

        //创建新的数组，长度是原数组的长度-1
        int[] newArr = new int[arr.length-1];
        //赋值原数组除了要删除的那个元素以外的其他元素
        for (int i = 0; i < newArr.length; i++) {
            //要删除的元素之前的元素
            if (i < dst){
                newArr[i] = arr[i];
            //要删除元素的元素之后的元素
            }else {
                newArr[i] = arr[i+1];
            }
        }

        //新数组替换旧数组
        arr = newArr;

        System.out.println(Arrays.toString(arr));

    }
}
