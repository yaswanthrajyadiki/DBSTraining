class Startup {
    
    constructor() {
        console.log("Constructor is called");
    }

    showDetails() {
        console.log("We called method");
    }

    public static main(): number {
        var startUp = new Startup();
        startUp.showDetails();
        return 0;
    }

}
Startup.main();