package own.stu.architecture.highConcurrenceDesignPattern._6_designPattern.future;

import java.util.concurrent.TimeUnit;

/**
 * Created by dell on 2017/10/31.
 */
public class RealData implements Data{

    protected final String result ;

    public RealData(String param) {
        //RealData的构造可能很慢，需要用户等待很久，这里使用sleep模拟
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<10;i++){
            sb.append(param);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.result = sb.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
