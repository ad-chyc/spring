package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
    private List nameList;
    private Set nameSet;
    private Map<String, String> nameMap;

    public List getNameList() {
        return nameList;
    }

    public void setNameList(List nameList) {
        this.nameList = nameList;
    }

    public Set getNameSet() {
        return nameSet;
    }

    public void setNameSet(Set nameSet) {
        this.nameSet = nameSet;
    }

    public Map<String, String> getNameMap() {
        return nameMap;
    }

    public void setNameMap(Map<String, String> nameMap) {
        this.nameMap = nameMap;
    }

    public static void main(String[] args) {
        String file = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(file);
        Collections collections = (Collections) context.getBean("collections");
        System.out.println("List: " + collections.getNameList());
        System.out.println("Map: " + collections.getNameMap());
        System.out.println("Set: " + collections.getNameSet());
    }
}
