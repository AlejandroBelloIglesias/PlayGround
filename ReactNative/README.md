## Crear un proyecto
```bash
npx react-native init AwesomeProject  
```

## CLI
Opciones:  
- npx react-native 	(npx viene inst con npm. react-native no se instala, solo se ejecuta c:)
- react-native-cli 	(Se instala con npm)
- expo 			(Se instala con npm)  
  
"npx react-native" es como "react-native-cli" pero de forma local.  

Mi preferencia actual es **npx react-native**:

Si usas "npx react-native". **react-native-cli DEBE ESTAR DESINSTALADO**
```bash
npm uninstall react-native-cli /
npm uninstall --global react-native-cli
```

check with:
```bash
npm list /
npm -g list
```

## Probar el proyecto
```bash
cd AwesomeProject  
npx react-native run-android  

npx react-native start  
```

## Crear unsigned debug.apk
[link](https://gist.github.com/erickhaendel/0ec3eb90eddac3e9ae6eb9ca40559050)

## Guías para el desarrollo
[Hello World](https://reactnative.dev/docs/tutorial)
[Style](https://reactnative.dev/docs/style)
[Flexbox layout](https://reactnative.dev/docs/flexbox)
[ReactNative components and APIS](https://reactnative.dev/docs/components-and-apis)
[Navigation - Routing](https://reactnative.dev/docs/navigation)
[Networking - Fetching from API](https://reactnative.dev/docs/network)



