public class Account {
    public static void main(String[] args){
        System.out.println("\n--------------家庭收支记账软件--------------");
        System.out.println("                1 收支明细");
        System.out.println("                2 登记收入");
        System.out.println("                3 登记支出");
        System.out.println("                4 退出");
        System.out.println();
        System.out.println("               请选择(1-4) ");
         char key = UtilityU.readMenuSelection();
        switch(key){
            case 1:
                //收入明细
                System.out.println("--------------当前收支明细记录--------------");
                //待补充
                System.out.println("----------------------------");
                break;
            case 2:
                System.out.println("请输入收入金额；");
                //待补充
                System.out.println("请输入收入说明");
                //待补充
                System.out.println("----------登记完成----------");
                break;
            case 3:
                //登记支出
                System.out.println("请输入支出金额；");
                //待补充
                System.out.println("----------------------------");
                //待补充
                System.out.println("----------登记完成----------");
                break;
            case 4:
                //退出
                System.out.println("确认是否退出(Y/N):");
                //待补充
                break;



        }
    }
}

