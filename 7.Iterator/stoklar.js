/* Singleton */
var stoklar = (function () {
  // Instance stores a reference to the Singleton
  var instance;

  function init() {
    // Singleton
    // Private methods and variables
    var ID = Math.random();
    var stokArr = [];
    return {
      // Public methods and variables
      stokPush(x) {
        stokArr.push(x);
      },
      stokPop() {
        return stokArr.pop();
      },
      getStok() {
        return stokArr;
      }
    };
  };
  return {
    // Get the Singleton instance if one exists
    // or create one if it doesn't
    getInstance: function () {
      if (!instance) {
        instance = init();
      }
      return instance;
    }
  };
})();

export default stoklar;