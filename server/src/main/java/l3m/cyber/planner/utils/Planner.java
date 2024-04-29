package l3m.cyber.planner.utils;

import l3m.cyber.planner.requests.PlannerParameter;
import l3m.cyber.planner.responses.PlannerResult;

import java.util.ArrayList;


public class Planner{

    /*********/ public Double[][] distances;
    int k;
    int start;
    /*********/ public Partition partition;
    ArrayList< ArrayList<Integer> > tournees; //*****************************
    ArrayList<Double> longTournees;  //***********************************


    public Planner(PlannerParameter param){
        this(param.matrix(), param.k(), param.start());

    }

    public Planner(Double[][] distances, int k, int debut){
        // TODO : a completer
        this.k = k;
        this.start = debut;
        this.distances = distances;
    }

    public Planner(){
        this(null, 0, 0);
    }


    
    public PlannerResult result(){
        
        
        //return new PlanningResult(tournees, longTournees);
        ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
       ArrayList<Double> b= new ArrayList<Double>();
        return new PlannerResult(a, b); // TODO: remplacer par la ligne precedente

        //return new PlannerResult(new ArrayList<ArrayList<Integer>>(), new ArrayList<Double>()); // TODO: remplacer par la ligne precedente

    }

    public void  divise(){
        partition.partitionne(distances);
    }


    
}