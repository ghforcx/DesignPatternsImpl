package observerPattern;

import com.CounterX.observerPattern.event.EventChannel;
import com.CounterX.observerPattern.observer.ObserverImpl;
import com.CounterX.observerPattern.subject.Subject;
import com.CounterX.observerPattern.subject.SubjectImpl;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test01() {
        // 初始化 channel
        EventChannel channel = new EventChannel();
        channel.registry(new ObserverImpl("observer1"));
        channel.registry(new ObserverImpl("observer2"));
        channel.registry(new ObserverImpl("observer3"));
        // 调用 subject
        Subject subject = new SubjectImpl();
        subject.setChannel(channel);
        subject.test("test");
    }
}
