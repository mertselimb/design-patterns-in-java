  const proto = {
    constructor(stok) {
      this.ID = Math.random();
      var stok = stok;
      if (!this.sonGuncelleme) {
        let date = new Date();
        this.sonGuncelleme = date.getTime();
      }
    },
    stokEkle() {
      let date = new Date();
      this.sonGuncelleme = date.getTime();
      this.stok += 1;
    },
    stokCikar() {
      let date = new Date();
      this.sonGuncelleme = date.getTime();
      this.stok -= 1;
    },
    getID() {
      let date = new Date();
      this.sonGuncelleme = date.getTime();
      return this.ID;
    },
    getSonGuncelleme() {
      return this.sonGuncelleme;
    }
  };

  function factoryStok() {
    return Object.create(proto);
  }


  export default factoryStok();