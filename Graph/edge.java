import java.util.*;

class edge{
	private int vertex, weight;
	
	Edge(int vertex, int weight = 0){
		this.vertex = vertex;
		this.weight = weight;
	}
	
	int getVertex(){
		return this.vertex;
	}
	int getWeight(){
		return this.weight;
	}
	void setVertex(int vertex){
		this.vertex = vertex;
	}
	void setWeight(int weight){
		this.weight = weight;
	}
}