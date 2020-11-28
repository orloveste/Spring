Vue.component('personItem', {
    props: ['itemProperty'],
    template: '<tr>' +
        '<td>{{itemProperty.itemName}}</td>' +
        '<td>{{itemProperty.itemCNP}}</td>' +
        '<td>{{itemPtoperty.itemSex}}</td>'
        </tr>,
})

var app = new Vue({
    el:'#person',
    data: {
        personItem: {
            name: '',
            cnp: '',
            sex : ''
        },
        items : [],
        personSex: [
            'Male', 'Female', 'Other'
        ],
    },
    methods: {
        addPerson: function () {
            this.items.push({
                itemName : this.itemName.name,
                itemCNP : this.itemCNP.cnp,
                itemSex : this.itemSex.sex
            })
            this.personItem.name = '';
            this.personItem.cnp = '';
            this.personItem.sex = '';
        },
        removeItem : function(item){
            var index = this.items.indexOf(item);
            let confirmation =
                window.prompt("Confirm?");
            if (index !== -1 && confirmation==='Yes'){
                this.items.splice(index, 1);
            }
        }
    }
})