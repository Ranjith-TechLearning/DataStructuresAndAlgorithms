package mylearning.arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class DuplicateFinding {

    //[3, 2, 1, 3, 5]
//[3], [4]

        public static void main(String[] args) {
            int[] inputArray = {3,2,1,3,5};
            DuplicateFinding solution = new DuplicateFinding();
            ReturnObject returnObject = solution.findDuplicateAndMissing(inputArray);
            System.out.println("Missing entries :");
            returnObject.missingId.stream().forEach(entry -> System.out.println(entry));
            System.out.println("Duplicate entries :");
            returnObject.duplicateId.stream().forEach(entry -> System.out.println(entry));

        }

        private ReturnObject findDuplicateAndMissing(int[] ids){
            if(ids == null || ids.length==0){
                return new ReturnObject(null, null);
            }
            List<Integer> duplicateIds = new ArrayList<>();
            List<Integer> missingIds = new ArrayList<>();
            Arrays.sort(ids);
            int pointer = 0;// 1,2,3,3,5
            for(int i=1; i<ids.length; i++){
                if(ids[pointer] == ids[i]){
                    duplicateIds.add(ids[i]);
                }else{
                    if(ids[i] != ids[pointer]+1) {
                        missingIds.add(ids[pointer]+1);
                    }
                    pointer++;
                }

            }
            return new ReturnObject(missingIds, duplicateIds);
        }

        class ReturnObject {
            List<Integer> missingId;
            List<Integer> duplicateId;
            ReturnObject(List<Integer> missingId, List<Integer> duplicateId){
                this.missingId= missingId;
                this.duplicateId=duplicateId;
            }
        }
    }



