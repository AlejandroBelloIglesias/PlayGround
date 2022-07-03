<script>
    import "../app.css";
	import Header from '$lib/Header.svelte';
</script>

<Header/>
<main class="pt-2 px-2 md:px-5">
    <slot/>
</main>