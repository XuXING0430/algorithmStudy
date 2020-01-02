
/**
 *
 * 测试MyArray
 */
public class TestMyArray {
    public static void main(String[] args) {
        //创建一个可变的数组
        MyArray myArray = new MyArray();

        //获取长度
        int size = myArray.size();
        myArray.show();

        //往可变数组中添加一个元素
        myArray.add(99);
        myArray.add(98);
        myArray.add(97);
        //显示所有元素到控制台
        myArray.show();

        //删除某个元素
        myArray.delete(1);
        myArray.show();

        //取出指定位置的元素
        int element = myArray.get(1);
        System.out.println(element);
        System.out.println("=============");

        //在指定位置插入元素
        myArray.insert(2,96);
        myArray.show();
        System.out.println("============");

        //替换指定位置的元素
        myArray.set(-1,100);
        myArray.show();
        System.out.println(myArray.size());
    }
}
