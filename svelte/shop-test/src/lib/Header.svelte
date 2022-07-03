<script>
  let kartEnabled = false;
  import { kart_items } from "../store.js"
</script>

<nav class="flex items-center justify-between flex-wrap p-6 shadow-md">
    
  <div class="flex items-center flex-shrink-0 mr-6">
    <span class="font-semibold text-3xl">ShopKartn't</span>
  </div>

  <button 
    class="bg-green-700 px-3 py-2 rounded-lg text-white text-sm"
    on:click={() => kartEnabled = !kartEnabled}
    >
    Kart
  </button>

  {#if kartEnabled}
  <div class="absolute right-5 top-20 w-56 rounded-sm shadow-lg bg-white ring-1 ring-black ring-opacity-10">
    {#if $kart_items.length}
    {#each $kart_items as item}
    <div class="flex items-center justify-between pl-2 pr-5 py-2 gap-4">
        <img class="w-13 h-10 rounded-full" src="{item.img}" alt="{item.name}">
        <span>{item.name}</span>
        <span>{item.amount}</span>
    </div>
    <hr/>
    {/each}
    {:else}
    <div class="text-center py-3">
      <span class="text-gray-500">Vacío</span>
    </div>
    {/if}

  </div>
  {/if}
  
</nav>