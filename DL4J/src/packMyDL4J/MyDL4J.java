package packMyDL4J;

import org.deeplearning4j.*;

import java.util.Random;

import java.io.File;

import org.datavec.api.split.FileSplit;

import org.datavec.image.loader.*;
import org.datavec.image.recordreader.*;
import org.datavec.api.io.labels.ParentPathLabelGenerator;


public class MyDL4J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int height = 28; 		// The number of rows of a matrix.
		  int width = 28; 		// The number of columns of a matrix.
		  int channels = 1;		// 	Grayscale implies single channel
		  int rngseed = 123;		// 	This random-number generator applies a seed to ensure that 
		  						//	the same initial weights are used when training. 
		  						//	 We’ll explain why this matters later.
		  Random randNumGen = new Random(rngseed);
		  int batchSize = 128;	// How many examples to fetch with each step.
		  int outputNum = 10; 	// Number of possible outcomes (e.g. labels 0 through 9).
		  int numEpochs = 1; 	// An epoch is a complete pass through a given dataset.
		    
		  File trainData = new File(ClassLoader.getSystemResource("training").getPath());
		  File testData = new File(ClassLoader.getSystemResource("testing").getPath());
		    
		  FileSplit train = new FileSplit(trainData, NativeImageLoader.ALLOWED_FORMATS,randNumGen);
		  FileSplit test = new FileSplit(testData,NativeImageLoader.ALLOWED_FORMATS,randNumGen);
		  
		  //Then we specify that we'll be reading the labels of images from the path:
		  ParentPathLabelGenerator labelMaker = new ParentPathLabelGenerator();
		  ImageRecordReader recordReader = new ImageRecordReader(height,width,channels,labelMaker);
		  
		  System.out.println(" END ");
		  
		  
		  
		
	}

}

//	Neural Network
//	







//306 Key Peninsula Hwy N, Lakebay, WA 98349