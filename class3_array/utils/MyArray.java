

/**
 *
 * 面向对象的数组
 */
public class MyArray {
    /*
        用于存储数据的数组
     */
    private int[] elements;

    public MyArray(){
        elements = new int[0];
    }

    /**
     * 获取数组的长度
     * @return
     */
    public int size(){
        return elements.length;
    }

    /**
     * 往数组的末尾添加一个数
     */
    public void add(int element){
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];

        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }

        //把添加的元素放入新的数组中
        newArr[newArr.length-1] = element;

        //新数组替换旧数组
        elements = newArr;
    }

    /**
     * 打印所有元素到控制台
     */

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 删除数组中的某个元素
     */
    public void delete(int index){
        //判断传入的下标
        if (index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        //创建一个新的数组
        int[] newArr = new int[elements.length -1];

        //把原来数组删除之后的元素赋值给新的数组
        for (int i = 0; i < newArr.length; i++) {
            //想要删除元素前面的元素
            if (i < index){
                newArr[i] = elements[i];
            //想要删除元素后面的元素
            }else {
                newArr[i] = elements[i + 1];
            }
        }

        //把新数组替换旧数组
        elements = newArr;
    }

    /**
     * 获取某个元素
     *
     */
    public int get(int index){
        //判断是否下标越界
        if (index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    /**
     * 插入一个元素到指定位置
     */
    public void insert(int index,int element){
        //判断是否下标越界
        if (index < 0 || index > elements.length){
            throw new RuntimeException("下标越界");
        }

        //新建一个数组
        int[] newArr = new int[elements.length + 1];

        //把原有数组中的值复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            //插入元素之前的元素
            if (i < index){
                newArr[i] = elements[i];
            //插入位置之后的元素
            }else {

                newArr[i + 1] = elements[i];
            }

        }
        //把要插入的元素方到指定位置
        newArr[index] = element;

        //新数组替换旧数组
        elements = newArr;
    }

    /**
     * 替换指定位置的元素
     */
    public void set(int index,int element){
        //判断是否下标越界
        if (index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }
}
