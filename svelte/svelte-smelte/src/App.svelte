<script>
	import "smelte/src/tailwind.css";

	import { List, Button } from "smelte";

  const listOneLine = [{
		text: 'Item 1',
		icon: 'favorite',
	}, {
		text: 'Item 2',
		icon: 'favorite',
	}, {
		text: 'Item 3',
		icon: 'favorite',
	}];

	export let name;
</script>

<main class="text-center">
	<h1 class="text-blue-500">Hello {name}!</h1>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to learn how to build Svelte apps.</p>
	<Button icon='alert'></Button>
	<List items={listOneLine} />
</main>
