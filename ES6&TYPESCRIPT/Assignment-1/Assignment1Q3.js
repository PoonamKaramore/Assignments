"use strict";
var Order = {
    id: 10,
    title: 'order',
    price: 100,
    printOrder() {
        console.log(this.id + this.title + this.price);
    },
    getPrice() {
        return (this.price);
    }
};
var CopyObject = Object.assign(Order);
console.log(CopyObject);
//# sourceMappingURL=Assignment1Q3.js.map