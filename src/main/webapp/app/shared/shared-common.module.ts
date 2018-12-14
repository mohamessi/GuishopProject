import { NgModule } from '@angular/core';

import { GuishopSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [GuishopSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [GuishopSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class GuishopSharedCommonModule {}
