
package observerdesignpattern;

import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();
        
        // create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");
        
        // register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        
        // attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        
        // check for updates
        firstObserver.update();
        thirdObserver.update();
        
        // provider- subject(broadcaster)
        topic.postMessage("Hello Subscribers!");
    }
    
}
