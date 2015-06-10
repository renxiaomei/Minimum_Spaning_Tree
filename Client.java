

/**
 * apriori关联规则挖掘算法调用类C:\Users\Administrator\Desktop\DataMiningAlgorithm-master\DataMiningAlgorithm-master\AssociationAnalysis\DataMining_Apriori
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		String filePath = "C:\\Users\\Administrator\\Desktop\\testInput.txt";
		
		AprioriTool tool = new AprioriTool(filePath, 2);
		tool.printAttachRule(0.7);
	}
}
