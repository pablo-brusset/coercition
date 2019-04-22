function pareil(ent1, ent2){
    var rep;
    if (typeof ent1 === typeof ent2){ 
        rep ="c'est pareil ! ";
    }
  
    else {
        rep = "c'est pas pareil ! "
    }
    console.log(rep);
  }
  pareil("abc", "a");