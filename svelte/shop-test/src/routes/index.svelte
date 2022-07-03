<script>
    import { kart_items } from '../store.js'

    let items = [
        {
            name:"Tomate",
            img:"/assets/tomate.jpg",
            price:1500
        },
        {
            name:"Lechuga",
            img:"/assets/lechuga.jpg",
            price:1200
        },
        {
            name:"Guisantes",
            img:"/assets/guisantes.jpg",
            price:1000
        },
    ]

    function addToKart(item){
        //If contains the item, increase the amount
        let itemInKart = $kart_items.find(i => i.name == item.name)
        if(itemInKart){
            $kart_items = $kart_items.map(i => {
                if(i.name == item.name){
                    i.amount++
                }
                return i
            })
        }else{
            $kart_items = [...$kart_items, {
                name:item.name,
                img:item.img,
                price:item.price,
                amount:1
            }]
        }
        console.log($kart_items)
    }

</script>

<div class="xl:mx-32">

    <h1 class="text-2xl font-semibold my-6">
        Shop
    </h1>

    <!-- grid -->
    <div class="grid grid-flow-row-dense grid-cols-2 md:grid-cols-3 gap-3">

        <!-- items -->
        {#each items as item}
        <div class="max-w-sm rounded overflow-hidden shadow-lg border p-1">
            <img class="w-full" src={item.img} alt="Tomate">
            <div class="px-6 py-4">
              <div class="font-bold text-xl mb-2">{item.name}</div>
              <p class="text-gray-700 text-base">
                {item.price}
              </p>
            </div>
            <div class="px-6 pt-4 pb-2">
                <button class="bg-slate-800 text-white text-sm p-2 rounded-md"
                    on:click={()=>addToKart(item)}>
                    Add to kart
                </button>
            </div>
        </div>
        {/each}
    </div>
</div>
