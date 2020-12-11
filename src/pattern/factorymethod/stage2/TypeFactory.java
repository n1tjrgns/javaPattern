package pattern.factorymethod.stage2;

import pattern.factorymethod.stage1.Type;
import pattern.factorymethod.stage1.TypeA;
import pattern.factorymethod.stage1.TypeB;
import pattern.factorymethod.stage1.TypeC;

public class TypeFactory {

    public Type createType(String type){
        Type returnType = null;
        switch (type){
            case "A":
                returnType = new TypeA();
                break;

            case "B":
                returnType = new TypeB();
                break;

            case "C":
                returnType = new TypeC();
                break;
        }

        return returnType;
    }
}
