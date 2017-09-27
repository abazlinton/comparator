import java.util.*;


class FundsComparator implements Comparator<Fundable> {

  SortType sortType;

  public FundsComparator(SortType sortType){ 
    this.sortType = sortType;
  }

  @Override
  public int compare(Fundable f1, Fundable f2){
    int returnMultiplier = 0;

    if (this.sortType == SortType.ASC){
      returnMultiplier = 1;
    } else if (this.sortType == SortType.DESC){
      returnMultiplier = -1;
    }

    if (f1.getFunds() < f2.getFunds()){
      return returnMultiplier * -1;
    } else if (f1.getFunds() == f2.getFunds()){
      return 0;
    } else {
      return returnMultiplier * 1;
    }
  }



}