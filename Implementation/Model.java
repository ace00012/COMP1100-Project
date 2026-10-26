// This code does nothing right now. Weka.jar needs to be referenced for this to build

import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.*;

public class Model {
	public static void main(String[] args) throws Exception {
		FastVector<Attribute> fv = new FastVector<Attribute>(100);
		for(int i=0; i<100; i++) {
			Attribute att = new Attribute("a" + i);
			fv.add(att);
		}
		Instances data = new Instances("Data", fv, 100);
		
		MultilayerPerceptron mlp = new MultilayerPerceptron();
		//mlp.buildClassifier(data);
		
	}
}
