
/**
 *
 * 从1加到一百
 */
public class AddOne2Hundred {
    public static void main(String[] args) {
        int total = 0;
        int end = 100;

        //循环相加计算
        /*for (int i = 0; i <= end ; i++) {
            total = total + i;
        }*/

        //直接计算
        total = (end+1)*end/2;
        //算法没有最好，只有最适合的
        //打印结果
        System.out.println(total);
    }
}
