import kitap from "kitap.js";

class miniKitap extends kitap {
    constructor(sayfa){
        this.ozelSayfaSayisi = sayfa;
    }
  }

export default miniKitap;