const app = new Vue({
    el: '#app',
    data: {
        title: 'Hello Vue!',
        fruits: [
            {name: 'apple', price: '2.00'},
            {name: 'orange', price: '1.50'},
            {name: 'banana', price: '0.75'},
            {name: 'pear', price: '0.00'}
        ],
        tempFruit: '',
    },
    methods: {
        addFruit () {
            this.fruits.push({
                name: this.tempFruit,
                price: '0.00'
            });
            this.tempFruit = '';
        }
    }
});
