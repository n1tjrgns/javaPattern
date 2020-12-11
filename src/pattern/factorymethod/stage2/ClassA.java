package pattern.factorymethod.stage2;

import pattern.factorymethod.stage1.Type;

public class ClassA {
    public Type createType(String type){
        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);

        return returnType;
    }
}
