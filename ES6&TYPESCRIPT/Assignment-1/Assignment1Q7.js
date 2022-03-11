"use strict";
var names = ["alpha", "beta", "gamma", "delta"];
var [firstele, secondele, thirdele, fourthele] = names;
console.log(thirdele);
//Ans b.
var organization = {
    name: "xyz",
    address: {
        city: "NY",
        state: "NY",
        pincode: 12345
    }
};
const { address: { city: city1, state: state1, pincode: pincode1 } } = organization;
console.log(pincode1);
//# sourceMappingURL=Assignment1Q7.js.map